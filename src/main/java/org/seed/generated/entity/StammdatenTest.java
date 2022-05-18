package org.seed.generated.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.seed.core.application.TransferableObject;
import org.seed.core.codegen.GeneratedCode;
import org.seed.core.entity.value.AbstractValueObject;
import org.seed.core.entity.value.ValueEntity;

@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class StammdatenTest extends AbstractValueObject implements GeneratedCode,ValueEntity,TransferableObject {

	private String uid;

	private String stammdatenwert;

	@JsonIgnore
	public Long getEntityId() {
		return 1071L;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid=uid;
	}

	public String getStammdatenwert() {
		return stammdatenwert;
	}

	public void setStammdatenwert(String stammdatenwert) {
		this.stammdatenwert=stammdatenwert;
	}

}
