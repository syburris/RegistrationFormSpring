package com.YoungMoney.services;

import com.YoungMoney.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by stevenburris on 10/26/16.
 */
public interface UserRepo extends CrudRepository<User, Integer>{
}
