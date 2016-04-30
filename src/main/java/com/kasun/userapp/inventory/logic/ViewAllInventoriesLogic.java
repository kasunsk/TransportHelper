package com.kasun.userapp.inventory.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kasun.userapp.inventory.dao.InventoryDao;
import com.kasun.userapp.inventory.dto.Tenant;
import com.kasun.userapp.inventory.model.Inventory;

/**
 * @author Kasun Kariyawasam
 *
 * Jan 4, 2015
 */
public class ViewAllInventoriesLogic extends StatelessServiceLogic<List<Inventory>,Tenant>{

	@Autowired
	private InventoryDao inventoryDao;
	
	@Override
	public List<Inventory> invoke(Tenant tenant) {
		
		List<Inventory>  allInventories = inventoryDao.viewAll(tenant);
		validate(allInventories);
		
		return allInventories;
	}
	

	private void validate(List<Inventory> allInventories) {
		// TODO Auto-generated method stub
		
	}


	public void setInventoryDao(InventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}

}
