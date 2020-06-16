package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.mapper.PassengerMapper;
import com.org.page.Page;
import com.org.po.PassengerPo;
import com.org.service.PassengerService;

@Transactional
@Service(value="passengerService")
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerMapper passengerMapper;
	
	@Override
	public int deleteById(Integer id) {
		return passengerMapper.deleteById(id);
	}

	@Override
	public int insertAll(PassengerPo passengerPo) {
		return passengerMapper.insertAll(passengerPo);
	}

	@Override
	public PassengerPo selectById(Integer id) {
		return passengerMapper.selectById(id);
	}

	@Override
	public int updateById(PassengerPo passengerPo) {
		return passengerMapper.updateById(passengerPo);
	}

	@Override
	public Page<PassengerPo> pageFuzzyselect(String name, Page<PassengerPo> vo) {
		int start=0;
		if (vo.getCurrentPage()>1) {
			start=(vo.getCurrentPage()-1)*vo.getPageSize();
		}
		List<PassengerPo> list= passengerMapper.pageFuzzyselect(name, start, vo.getPageSize());
		vo.setResult(list);
		int count= passengerMapper.countFuzzyselect(name);
		vo.setTotal(count);
		return vo;
	}

	@Override
	public List<PassengerPo> selectAll() {
		return passengerMapper.selectAll();
	}

	@Override
	public List<PassengerPo> selectAjaxList(String name) {
		return passengerMapper.selectAjaxList(name);
	}

	@Override
	public int selectYZ(String papersNumber) {
		return this.passengerMapper.selectYZ(papersNumber);
	}

}
