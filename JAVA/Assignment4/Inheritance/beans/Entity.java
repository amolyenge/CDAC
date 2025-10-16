package com.Inheritance.beans;

public abstract class Entity {
    protected String name;
    protected String email;

    public Entity(String name, String email) {
        this.name = name;
        this.email = email;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Entity() {
		super();
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + ", email=" + email + "]";
	}

	
    
}
