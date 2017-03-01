package cz.mka.impl.jpa;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 * Represents a user (a person) who consumes drinks.
 */
@Entity
@Table(name = "DRINKER")
public class Drinker {

	@Id
	@Column(name = "DRINKER_ID")
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "NICK_NAME")
	private String nickName;
	
	@Column(name = "DATE_REGISTRATION")
	private LocalDateTime dateRegistration;
	
	@Column(name = "COMMENT")
	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(LocalDateTime dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Drinker drinkerDTO = (Drinker) o;
		return Objects.equal(id, drinkerDTO.id) && Objects.equal(firstName, drinkerDTO.firstName)
				&& Objects.equal(lastName, drinkerDTO.lastName) && Objects.equal(nickName, drinkerDTO.nickName)
				&& Objects.equal(comment, drinkerDTO.comment)
				&& Objects.equal(dateRegistration, drinkerDTO.dateRegistration);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, firstName, lastName, nickName, comment, dateRegistration);
	}
}
