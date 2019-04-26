package dao;

import vo.Movies;

public interface MoviesMapper {
    int deleteByPrimaryKey(Integer movieId);

    int insert(Movies record);

    int insertSelective(Movies record);

    Movies selectByPrimaryKey(Integer movieId);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);
}