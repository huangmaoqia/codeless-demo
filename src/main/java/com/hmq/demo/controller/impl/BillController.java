package com.hmq.demo.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmq.demo.model.po.Bill;
import com.hmq.demo.model.vo.BillVO;
import com.hmq.demo.service.IBillService;
import com.hmq.framework.controller.impl.GenViewController;

@RestController
@RequestMapping("/bill")
public class BillController extends GenViewController<BillVO, Bill, String, IBillService> {
}
