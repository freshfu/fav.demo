package dao;

import vo.Pig;

public interface PigMapper {
    int deleteByPrimaryKey(Integer pigId);

    int insert(Pig record);

    int insertSelective(Pig record);

    Pig selectByPrimaryKey(Integer pigId);

    int updateByPrimaryKeySelective(Pig record);

    int updateByPrimaryKey(Pig record);
}