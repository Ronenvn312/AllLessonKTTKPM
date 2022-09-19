package baithuchanh.tuan4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NhanVien nhanVien;
	private MayBay mayBay;
	

	
//	@Id
//	@Column(name = "MaMB")
//	private String maMB;
	@Id
	@ManyToOne
	@JoinColumn(name = "maNV")
	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	@Id
	@ManyToOne
	@JoinColumn(name = "maMB")
	public MayBay getMayBay() {
		return mayBay;
	}

	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}
	
	
	
}
