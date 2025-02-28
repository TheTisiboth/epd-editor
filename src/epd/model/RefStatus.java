package epd.model;

import org.openlca.ilcd.commons.Ref;

public class RefStatus {

	public static final int OK = 0;
	public static final int INFO = 1;
	public static final int WARNING = 2;
	public static final int ERROR = 4;
	public static final int CANCEL = 8;
	public static final int DOWNLOADED = 16;

	public final int value;
	public final Ref ref;
	public final String message;

	public RefStatus(int value, Ref ref, String message) {
		this.value = value;
		this.ref = ref;
		this.message = message;
	}

	public static RefStatus ok(Ref ref, String message) {
		return new RefStatus(OK, ref, message);
	}

	public static RefStatus info(Ref ref, String message) {
		return new RefStatus(INFO, ref, message);
	}

	public static RefStatus warning(Ref ref, String message) {
		return new RefStatus(WARNING, ref, message);
	}

	public static RefStatus error(Ref ref, String message) {
		return new RefStatus(ERROR, ref, message);
	}

	public static RefStatus cancel(Ref ref, String message) {
		return new RefStatus(CANCEL, ref, message);
	}

	public static RefStatus downloaded(Ref ref, String message) {
		return new RefStatus(DOWNLOADED, ref, message);
	}
}
