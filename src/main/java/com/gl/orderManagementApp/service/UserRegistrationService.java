package com.gl.orderManagementApp.service;

import com.gl.orderManagementApp.dto.SellerDto;

import java.util.List;

public interface UserRegistrationService {
    String registerSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
