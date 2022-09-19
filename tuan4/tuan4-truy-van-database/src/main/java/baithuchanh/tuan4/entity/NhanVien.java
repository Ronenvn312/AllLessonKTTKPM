package baithuchanh.tuan4.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {

	@Id
	@Column(name = "MaNV")
	private String maNV;
	@Column(name = "TenNV")
	private String tenNV;
	@Column(name = "Luong")
	private int Luong;

//	@OneToMany(mappedBy = "nhanvien")
//	private Set ChungNhan;
//	public Set getChungNhan() {
//		return ChungNhan;
//	}
//
//	public void setChungNhan(Set chungNhan) {
//		ChungNhan = chungNhan;
//	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public int getLuong() {
		return Luong;
	}

	public void setLuong(int luong) {
		Luong = luong;
	}

	public NhanVien(String maNV, String tenNV, int luong) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		Luong = luong;
	}

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", Luong=" + Luong + "]";
	}

}
