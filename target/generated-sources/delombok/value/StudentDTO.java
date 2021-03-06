package com.azhwani.value;

public final class StudentDTO {
	private final String firstName;
	private final String lastName;
	private final int age;

	@java.beans.ConstructorProperties({"firstName", "lastName", "age"})
	public StudentDTO(final String firstName, final String lastName, final int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof StudentDTO)) return false;
		final StudentDTO other = (StudentDTO) o;
		final Object this$firstName = this.getFirstName();
		final Object other$firstName = other.getFirstName();
		if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
		final Object this$lastName = this.getLastName();
		final Object other$lastName = other.getLastName();
		if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
		if (this.getAge() != other.getAge()) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $firstName = this.getFirstName();
		result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
		final Object $lastName = this.getLastName();
		result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
		result = result * PRIME + this.getAge();
		return result;
	}

	@Override
	public String toString() {
		return "StudentDTO(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", age=" + this.getAge() + ")";
	}
}
