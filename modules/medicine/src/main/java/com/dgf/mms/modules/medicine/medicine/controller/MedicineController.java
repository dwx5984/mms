package com.dgf.mms.modules.medicine.medicine.controller;


import com.dgf.mms.modules.common.controller.BaseController;
import com.dgf.mms.modules.medicine.medicine.entity.Medicine;
import com.dgf.mms.modules.medicine.medicine.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 药品表 前端控制器
 * </p>
 *
 * @author dengganfeng
 * @since 2019-02-16
 */
@RestController
@RequestMapping("/medicine/medicine")
public class MedicineController extends BaseController<Medicine> {

    @Autowired
    private IMedicineService medicineService;

}
