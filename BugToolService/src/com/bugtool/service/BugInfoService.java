package com.bugtool.service;

import com.bugtool.model.BugInfo;

public interface BugInfoService {
	
	public void createBugInfo(BugInfo bugInfo);
	public void editBugInfo(BugInfo bugInfo);
	public void deleteBugInfo(BugInfo bugInfo);
	public BugInfo findBugInfoById(Integer id);

}
