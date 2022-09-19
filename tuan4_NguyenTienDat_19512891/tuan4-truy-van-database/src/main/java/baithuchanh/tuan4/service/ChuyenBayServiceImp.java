package baithuchanh.tuan4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baithuchanh.tuan4.dao.ChuyenBayDao;
import baithuchanh.tuan4.entity.ChuyenBay;

@Service
public class ChuyenBayServiceImp implements ChuyenBayService{

	@Autowired
	private ChuyenBayDao cbDao;
	@Override
	@Transactional
	public List<ChuyenBay> getChuyenBayDaLat(String gaDi) {
		return cbDao.getChuyenBayDaLat(gaDi);
	}

}
