package com.example.gongzhonghao.Service.UserRegister.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gongzhonghao.Domain.AddressBook;
import com.example.gongzhonghao.Mapper.AddressBookMapper;
import com.example.gongzhonghao.Service.UserRegister.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
