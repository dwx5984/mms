package com.dgf.mms.modules.medicine.medicine.controller;


import com.dgf.mms.modules.common.enums.ResponseType;
import com.dgf.mms.modules.common.response.ResultDTO;
import com.dgf.mms.modules.medicine.medicine.entity.Medicine;
import com.dgf.mms.modules.medicine.medicine.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
public class MedicineController {

    @Autowired
    private IMedicineService medicineService;

    @PostMapping("/save")
    public ResultDTO save(Medicine medicine){
        medicine.setMerchantId(1);
        if(medicineService.save(medicine)){
            return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), null);
        }
        return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), null);
    }

    @GetMapping("/delete")
    public ResultDTO delete(Integer id){
        if(medicineService.removeById(id)){
            return new ResultDTO(ResponseType.OK.getValue(), ResponseType.OK.getName(), null);
        }
        return new ResultDTO(ResponseType.ACCESS_ERROR.getValue(), ResponseType.ACCESS_ERROR.getName(), null);
    }



    
}
