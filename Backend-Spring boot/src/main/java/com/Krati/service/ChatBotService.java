package com.Krati.service;

import com.Krati.model.CoinDTO;
import com.Krati.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
