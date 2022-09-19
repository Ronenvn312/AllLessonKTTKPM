package baithuchanh.tuan4.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import baithuchanh.tuan4.entity.ChuyenBay;
import baithuchanh.tuan4.entity.MayBay;
import baithuchanh.tuan4.service.ChuyenBayService;
import baithuchanh.tuan4.service.MayBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayRestController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	@Autowired
	private MayBayService mayBayService;
	@GetMapping("/chuyenbayDAD")
	public List<ChuyenBay> getChuyenBayDADs(){
		return chuyenBayService.getChuyenBayDaLat("DAD");
	} 
	@GetMapping("/mayBays")
	public List<MayBay> getMayBays(){
		return mayBayService.getMayBayHon1000();
	}
}
