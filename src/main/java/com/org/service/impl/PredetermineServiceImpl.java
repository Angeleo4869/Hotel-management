package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.mapper.PredetermineMapper;
import com.org.page.Page;
import com.org.po.PredeterminePo;
import com.org.service.PredetermineService;

@Transactional
@Service(value="predetermineService")
public class PredetermineServiceImpl implements PredetermineService {

	@Autowired
	private PredetermineMapper predetermineMapper;
	
	@Override
	public int insertAll(PredeterminePo predeterminePo) {
		return predetermineMapper.insertAll(predeterminePo);
	}
	@Override
	public Page<PredeterminePo> pageFuzzyselect(String receiveTeamName,
			String passengerName, int predetermineStateID,
			Page<PredeterminePo> vo) {
		int start=0;
		if (vo.getCurrentPage()>1) {
			start=(vo.getCurrentPage()-1)*vo.getPageSize();
		}
		List<PredeterminePo> list= predetermineMapper.pageFuzzyselect(receiveTeamName,
				passengerName, predetermineStateID, start, vo.getPageSize());
		vo.setResult(list);
		int count= predetermineMapper.countFuzzyselect(receiveTeamName, passengerName, predetermineStateID);
		vo.setTotal(count);
		return vo;
	}
	@Override
	public PredeterminePo findById(Integer id) {
		return this.predetermineMapper.findById(id);
	}
	@Override
	public List<PredeterminePo> findLvKeId(Integer id) {
		return this.predetermineMapper.findLvKeId(id);
	}
	@Override
	public List<PredeterminePo> findTeamId(Integer id) {
		return this.predetermineMapper.findTeamId(id);
	}
	@Override
	public int deleteById(Integer id) {
		return this.predetermineMapper.deleteById(id);
	}
	@Override
	public List<PredeterminePo> selectAll() {
		return this.predetermineMapper.selectAll();
	}
	@Override
	public int updateRemind(Integer id) {
		return this.predetermineMapper.updateRemind(id);
	}
	@Override
	public int updatePredetermineStateID(Integer id) {
		return this.predetermineMapper.updatePredetermineStateID(id);
	}

}
