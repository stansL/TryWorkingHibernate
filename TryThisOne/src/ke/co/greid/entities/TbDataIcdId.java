package ke.co.greid.entities;

// Generated Mar 23, 2015 2:25:21 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TbDataIcdId generated by hbm2java
 */
@Embeddable
public class TbDataIcdId implements java.io.Serializable {

	private Integer col1;
	private String col2;
	private String col3;
	private Integer col4;
	private String col5;
	private String col6;
	private String col7;
	private String col8;
	private String col9;
	private String col10;
	private String col11;
	private String col12;
	private String col13;
	private String col14;

	public TbDataIcdId() {
	}

	public TbDataIcdId(Integer col1, String col2, String col3, Integer col4,
			String col5, String col6, String col7, String col8, String col9,
			String col10, String col11, String col12, String col13, String col14) {
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
		this.col4 = col4;
		this.col5 = col5;
		this.col6 = col6;
		this.col7 = col7;
		this.col8 = col8;
		this.col9 = col9;
		this.col10 = col10;
		this.col11 = col11;
		this.col12 = col12;
		this.col13 = col13;
		this.col14 = col14;
	}

	@Column(name = "col1")
	public Integer getCol1() {
		return this.col1;
	}

	public void setCol1(Integer col1) {
		this.col1 = col1;
	}

	@Column(name = "col2", length = 1)
	public String getCol2() {
		return this.col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	@Column(name = "col3", length = 1)
	public String getCol3() {
		return this.col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3;
	}

	@Column(name = "col4")
	public Integer getCol4() {
		return this.col4;
	}

	public void setCol4(Integer col4) {
		this.col4 = col4;
	}

	@Column(name = "col5", length = 3)
	public String getCol5() {
		return this.col5;
	}

	public void setCol5(String col5) {
		this.col5 = col5;
	}

	@Column(name = "col6", length = 6)
	public String getCol6() {
		return this.col6;
	}

	public void setCol6(String col6) {
		this.col6 = col6;
	}

	@Column(name = "col7", length = 5)
	public String getCol7() {
		return this.col7;
	}

	public void setCol7(String col7) {
		this.col7 = col7;
	}

	@Column(name = "col8", length = 4)
	public String getCol8() {
		return this.col8;
	}

	public void setCol8(String col8) {
		this.col8 = col8;
	}

	@Column(name = "col9", length = 185)
	public String getCol9() {
		return this.col9;
	}

	public void setCol9(String col9) {
		this.col9 = col9;
	}

	@Column(name = "col10", length = 5)
	public String getCol10() {
		return this.col10;
	}

	public void setCol10(String col10) {
		this.col10 = col10;
	}

	@Column(name = "col11", length = 5)
	public String getCol11() {
		return this.col11;
	}

	public void setCol11(String col11) {
		this.col11 = col11;
	}

	@Column(name = "col12", length = 5)
	public String getCol12() {
		return this.col12;
	}

	public void setCol12(String col12) {
		this.col12 = col12;
	}

	@Column(name = "col13", length = 5)
	public String getCol13() {
		return this.col13;
	}

	public void setCol13(String col13) {
		this.col13 = col13;
	}

	@Column(name = "col14", length = 5)
	public String getCol14() {
		return this.col14;
	}

	public void setCol14(String col14) {
		this.col14 = col14;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbDataIcdId))
			return false;
		TbDataIcdId castOther = (TbDataIcdId) other;

		return ((this.getCol1() == castOther.getCol1()) || (this.getCol1() != null
				&& castOther.getCol1() != null && this.getCol1().equals(
				castOther.getCol1())))
				&& ((this.getCol2() == castOther.getCol2()) || (this.getCol2() != null
						&& castOther.getCol2() != null && this.getCol2()
						.equals(castOther.getCol2())))
				&& ((this.getCol3() == castOther.getCol3()) || (this.getCol3() != null
						&& castOther.getCol3() != null && this.getCol3()
						.equals(castOther.getCol3())))
				&& ((this.getCol4() == castOther.getCol4()) || (this.getCol4() != null
						&& castOther.getCol4() != null && this.getCol4()
						.equals(castOther.getCol4())))
				&& ((this.getCol5() == castOther.getCol5()) || (this.getCol5() != null
						&& castOther.getCol5() != null && this.getCol5()
						.equals(castOther.getCol5())))
				&& ((this.getCol6() == castOther.getCol6()) || (this.getCol6() != null
						&& castOther.getCol6() != null && this.getCol6()
						.equals(castOther.getCol6())))
				&& ((this.getCol7() == castOther.getCol7()) || (this.getCol7() != null
						&& castOther.getCol7() != null && this.getCol7()
						.equals(castOther.getCol7())))
				&& ((this.getCol8() == castOther.getCol8()) || (this.getCol8() != null
						&& castOther.getCol8() != null && this.getCol8()
						.equals(castOther.getCol8())))
				&& ((this.getCol9() == castOther.getCol9()) || (this.getCol9() != null
						&& castOther.getCol9() != null && this.getCol9()
						.equals(castOther.getCol9())))
				&& ((this.getCol10() == castOther.getCol10()) || (this
						.getCol10() != null && castOther.getCol10() != null && this
						.getCol10().equals(castOther.getCol10())))
				&& ((this.getCol11() == castOther.getCol11()) || (this
						.getCol11() != null && castOther.getCol11() != null && this
						.getCol11().equals(castOther.getCol11())))
				&& ((this.getCol12() == castOther.getCol12()) || (this
						.getCol12() != null && castOther.getCol12() != null && this
						.getCol12().equals(castOther.getCol12())))
				&& ((this.getCol13() == castOther.getCol13()) || (this
						.getCol13() != null && castOther.getCol13() != null && this
						.getCol13().equals(castOther.getCol13())))
				&& ((this.getCol14() == castOther.getCol14()) || (this
						.getCol14() != null && castOther.getCol14() != null && this
						.getCol14().equals(castOther.getCol14())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCol1() == null ? 0 : this.getCol1().hashCode());
		result = 37 * result
				+ (getCol2() == null ? 0 : this.getCol2().hashCode());
		result = 37 * result
				+ (getCol3() == null ? 0 : this.getCol3().hashCode());
		result = 37 * result
				+ (getCol4() == null ? 0 : this.getCol4().hashCode());
		result = 37 * result
				+ (getCol5() == null ? 0 : this.getCol5().hashCode());
		result = 37 * result
				+ (getCol6() == null ? 0 : this.getCol6().hashCode());
		result = 37 * result
				+ (getCol7() == null ? 0 : this.getCol7().hashCode());
		result = 37 * result
				+ (getCol8() == null ? 0 : this.getCol8().hashCode());
		result = 37 * result
				+ (getCol9() == null ? 0 : this.getCol9().hashCode());
		result = 37 * result
				+ (getCol10() == null ? 0 : this.getCol10().hashCode());
		result = 37 * result
				+ (getCol11() == null ? 0 : this.getCol11().hashCode());
		result = 37 * result
				+ (getCol12() == null ? 0 : this.getCol12().hashCode());
		result = 37 * result
				+ (getCol13() == null ? 0 : this.getCol13().hashCode());
		result = 37 * result
				+ (getCol14() == null ? 0 : this.getCol14().hashCode());
		return result;
	}

}
