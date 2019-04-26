package services;

import dao.PigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.Pig;

@Service
public class FavService implements IFavService{

    @Autowired
    private PigMapper pigMapper;

    @Override
    public Pig queryPigByVO(Pig pig){
        return pigMapper.selectByPrimaryKey(pig.getPigId());
    }

}
