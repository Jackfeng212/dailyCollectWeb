package com.shkj.mapper;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.shkj.bean.DailyReportInfo;
@Repository
public interface DailyReportInfoMapper {

	//查看全部人员日报
	public List<DailyReportInfo> getAllDailyReportInfoList(Map<String, String> map);
	//查看个人日报
	public List<DailyReportInfo> getPersonDailyReportInfoList(Map<String, String> map);
    public int saveDailyInfo(DailyReportInfo info);
}
