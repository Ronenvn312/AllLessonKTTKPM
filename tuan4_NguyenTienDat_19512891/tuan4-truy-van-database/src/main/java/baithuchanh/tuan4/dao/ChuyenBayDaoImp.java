package baithuchanh.tuan4.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import baithuchanh.tuan4.entity.ChuyenBay;

@Repository
public class ChuyenBayDaoImp implements ChuyenBayDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<ChuyenBay> getChuyenBayDaLat(String gaDi) {
		Session curentSession = sessionFactory.getCurrentSession();
		
		Query<ChuyenBay> query = curentSession.createQuery("from chuyenbay where GaDi LIKE '"+gaDi+"'", ChuyenBay.class);
		
		List<ChuyenBay> chuyenBays = query.getResultList();
		return chuyenBays;
	}

}
