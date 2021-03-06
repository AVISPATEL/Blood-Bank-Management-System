package com.avi.bloodbank.service;

import java.util.List;

import com.avi.bloodbank.entity.Donor;
import com.avi.bloodbank.entity.DonorForgot;
import com.avi.bloodbank.entity.DonorLogin;
import com.avi.bloodbank.entity.DonorOtp;
import com.avi.bloodbank.entity.DonorTemp;



public interface DonorService {

public List<Donor> findAll();
	
	public Donor findById(int theId);
	
	public void save(Donor theDonor);
	
	public void deleteById(int id);
	
	 
	 public String login(DonorLogin theDonorLogin);

	public List<Donor> dash(DonorLogin theDonorLogin);

	String forgot(DonorForgot theDonorForgot);

	String sendEmail(DonorForgot theDonorForgot);
	
	int genRandom();

	String otpVerification(DonorOtp theDonorOtp);

	DonorTemp donorTemp(DonorTemp theDonorTemp);

	Donor sendData(DonorTemp theDonorTemp);

	
}
