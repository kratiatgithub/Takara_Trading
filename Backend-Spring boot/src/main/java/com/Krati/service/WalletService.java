package com.Krati.service;


import com.Krati.exception.WalletException;
import com.Krati.model.Order;
import com.Krati.model.User;
import com.Krati.model.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
