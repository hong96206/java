package com.ssm.online.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.online.exam.dao.StudentExamInfoMapper;
import com.ssm.online.exam.po.StudentExamInfo;
import com.ssm.online.exam.service.StudentExamInfoService;

/**
  *
  * <p>Title: StudentExamInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: taohan
  * @date: 2018-9-19
  * @time: 上午10:09:21
  * @version: 1.0
  */

@Service
public class StudentExamInfoServiceImpl implements StudentExamInfoService {

	@Autowired
	private StudentExamInfoMapper studentExamInfoMapper;
	
	public List<StudentExamInfo> getStudentExamCountByClassId(int classId) {
		return studentExamInfoMapper.getStudentExamCountByClassId(classId);
	}

	public List<StudentExamInfo> getStudentExamInfo(int studentId) {
		return studentExamInfoMapper.getStudentExamInfo(studentId);
	}

	public List<StudentExamInfo> getAllStudentAvgScoreCount(int classId) {
		return studentExamInfoMapper.getAllStudentAvgScoreCount(classId);
	}

}
