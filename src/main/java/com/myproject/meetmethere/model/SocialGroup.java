package com.myproject.meetmethere.model;


import java.util.List;
import java.util.Objects;


import javax.persistence.*;

@Entity
public class SocialGroup {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String group_name;
	
	
	protected SocialGroup() {
		
	}


	public SocialGroup(Integer id, String group_name) {
		super();
		this.id = id;
		this.group_name = group_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof SocialGroup)) return false;
		SocialGroup that = (SocialGroup) o;
		return id.equals(that.id) &&
				Objects.equals(group_name, that.group_name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, group_name);
	}
}
