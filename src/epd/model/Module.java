package epd.model;

import java.util.Objects;

import epd.util.Strings;

public class Module implements Comparable<Module> {

	public int index;
	public String name;
	public String description;

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public int compareTo(Module other) {
		if (other == null)
			return 1;
		return Integer.compare(this.index, other.index);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof Module))
			return false;
		Module other = (Module) obj;
		return Strings.nullOrEqual(this.name, other.name);
	}

}
