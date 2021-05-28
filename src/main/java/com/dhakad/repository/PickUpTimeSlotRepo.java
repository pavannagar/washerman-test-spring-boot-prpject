package com.dhakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.PickUpTimeSlot;
@Repository
public interface PickUpTimeSlotRepo extends JpaRepository<PickUpTimeSlot, Integer> {

}
