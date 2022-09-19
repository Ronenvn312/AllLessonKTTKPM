package baithuchanh.tuan4.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import baithuchanh.tuan4.entity.ChuyenBay;
import baithuchanh.tuan4.entity.MayBay;

@Repository
public class mayBayDaoImp implements MayBayDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<MayBay> getMayBayHon1000() {
		Session curentSession = sessionFactory.getCurrentSession();
		Query<MayBay> query = curentSession.createQuery("from maybay", MayBay.class);

		List<MayBay> maybays = query.getResultList();
		return maybays;
	}

}
