package baithuchanh.tuan4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baithuchanh.tuan4.dao.MayBayDao;
import baithuchanh.tuan4.entity.ChuyenBay;
import baithuchanh.tuan4.entity.MayBay;

@Service
public class MayBayServiceImp implements MayBayService{

	@Autowired
	private MayBayDao mayBayDao;
	@Override
	@Transactional
	public List<MayBay> getMayBayHon1000() {
		// TODO Auto-generated method stub
		return mayBayDao.getMayBayHon1000();
	}

}
