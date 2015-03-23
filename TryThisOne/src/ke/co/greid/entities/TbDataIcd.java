package ke.co.greid.entities;

// Generated Mar 23, 2015 2:25:21 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TbDataIcd generated by hbm2java
 */
@Entity
@Table(name = "tb_data_icd", catalog = "hims")
public class TbDataIcd implements java.io.Serializable {

	private TbDataIcdId id;

	public TbDataIcd() {
	}

	public TbDataIcd(TbDataIcdId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "col1", column = @Column(name = "col1")),
			@AttributeOverride(name = "col2", column = @Column(name = "col2", length = 1)),
			@AttributeOverride(name = "col3", column = @Column(name = "col3", length = 1)),
			@AttributeOverride(name = "col4", column = @Column(name = "col4")),
			@AttributeOverride(name = "col5", column = @Column(name = "col5", length = 3)),
			@AttributeOverride(name = "col6", column = @Column(name = "col6", length = 6)),
			@AttributeOverride(name = "col7", column = @Column(name = "col7", length = 5)),
			@AttributeOverride(name = "col8", column = @Column(name = "col8", length = 4)),
			@AttributeOverride(name = "col9", column = @Column(name = "col9", length = 185)),
			@AttributeOverride(name = "col10", column = @Column(name = "col10", length = 5)),
			@AttributeOverride(name = "col11", column = @Column(name = "col11", length = 5)),
			@AttributeOverride(name = "col12", column = @Column(name = "col12", length = 5)),
			@AttributeOverride(name = "col13", column = @Column(name = "col13", length = 5)),
			@AttributeOverride(name = "col14", column = @Column(name = "col14", length = 5)) })
	public TbDataIcdId getId() {
		return this.id;
	}

	public void setId(TbDataIcdId id) {
		this.id = id;
	}

}