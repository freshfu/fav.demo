package dao;

import vo.PigFav;

public interface PigFavMapper {
    int deleteByPrimaryKey(Integer pigFavId);

    int insert(PigFav record);

    int insertSelective(PigFav record);

    PigFav selectByPrimaryKey(Integer pigFavId);

    int updateByPrimaryKeySelective(PigFav record);

    int updateByPrimaryKey(PigFav record);
}