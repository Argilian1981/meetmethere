package com.myproject.meetmethere.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SocialMessage {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Date time_stamp;
	private String subject;
	private String body;
	
	protected SocialMessage() {
		
	}

	public SocialMessage(Integer id, Date time_stamp, String subject, String body) {
		super();
		this.id = id;
		this.time_stamp = time_stamp;
		this.subject = subject;
		this.body = body;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(Date time_stamp) {
		this.time_stamp = time_stamp;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((time_stamp == null) ? 0 : time_stamp.hashCode());
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
		SocialMessage other = (SocialMessage) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (time_stamp == null) {
			if (other.time_stamp != null)
				return false;
		} else if (!time_stamp.equals(other.time_stamp))
			return false;
		return true;
	}
	
	
}
