package com.myproject.meetmethere.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SocialGroup {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String group_name;
	@OneToMany(mappedBy = "socialGroup")
	private List<Socialite> socialiteList;
	
	
	protected SocialGroup() {
		
	}


	public SocialGroup(Integer id, String group_name, List<Socialite> socialiteList) {
		super();
		this.id = id;
		this.group_name = group_name;
		this.socialiteList = socialiteList;
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


	public List<Socialite> getSocialiteList() {
		return socialiteList;
	}


	public void setSocialiteList(List<Socialite> socialiteList) {
		this.socialiteList = socialiteList;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((group_name == null) ? 0 : group_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((socialiteList == null) ? 0 : socialiteList.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SocialGroup other = (SocialGroup) obj;
		if (group_name == null) {
			if (other.group_name != null)
				return false;
		} else if (!group_name.equals(other.group_name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (socialiteList == null) {
			if (other.socialiteList != null)
				return false;
		} else if (!socialiteList.equals(other.socialiteList))
			return false;
		return true;
	}


	

}
