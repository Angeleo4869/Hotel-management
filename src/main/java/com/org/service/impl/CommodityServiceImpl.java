package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.mapper.CommodityMapper;
import com.org.page.Page;
import com.org.po.CommodityPo;
import com.org.service.CommodityService;

@Transactional
@Service(value="commodityService")
public class CommodityServiceImpl implements CommodityService {

	@Autowired
	private CommodityMapper commodityMapper;
	
	@Override
	public int deleteById(Integer id) {
		return commodityMapper.deleteById(id);
	}

	@Override
	public int insertAll(CommodityPo commodityPo) {
		return commodityMapper.insertAll(commodityPo);
	}

	@Override
	public CommodityPo selectById(Integer id) {
		return commodityMapper.selectById(id);
	}

	@Override
	public int updateById(CommodityPo commodityPo) {
		return commodityMapper.updateById(commodityPo);
	}

	@Override
	public Page<CommodityPo> pageFuzzyselect(String commodityName,
		int commodityTypeID, Page<CommodityPo> vo) {
		int start=0;
		if (vo.getCurrentPage()>1) {
			start=(vo.getCurrentPage()-1)*vo.getPageSize();
		}
		List<CommodityPo> list= commodityMapper.pageFuzzyselect(commodityName, commodityTypeID, start, vo.getPageSize());
		vo.setResult(list);
		int count= commodityMapper.countFuzzyselect(commodityName, commodityTypeID);
		vo.setTotal(count);
		return vo;
	}

	@Override
	public List<CommodityPo> fuzzySelect(String commodityName,int commodityTypeID) {
		return commodityMapper.fuzzySelect(commodityName, commodityTypeID);
	}

	@Override
	public int selectYZ(String commodityName) {
		return this.commodityMapper.selectYZ(commodityName);
	}

}
