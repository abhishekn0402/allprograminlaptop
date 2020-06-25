package com.ITOrizon.springbootBookMyShows.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITOrizon.springbootBookMyShows.dto.Screen;

@Repository
public interface ScreenRepository  extends JpaRepository<Screen,Integer>
{

}
