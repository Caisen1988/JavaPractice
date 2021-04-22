package com.test.web.Dao;
import java.sql.*;

import com.test.web.connDB.ConnDB;
import com.test.web.vo.voBDIndepotDetail;
import java.util.ArrayList;


public class daoBDIndepotDetail {
	ConnDB connDB = new ConnDB();

	public ArrayList qryBDIndepotDetail()
	{
		ArrayList BDIndepotDetailList=new ArrayList();
		ResultSet rs = null;
		PreparedStatement psmt = null;
		String sSql = "select * from BDInDepotDetail";
			
		try {
			psmt = connDB.getConn().prepareStatement(sSql);
			rs  = psmt.executeQuery();	
			while (rs.next())
			{
				voBDIndepotDetail BDIndepotDetailAll=new voBDIndepotDetail();
				System.out.println(rs.getString("inDepotNo"));
				BDIndepotDetailAll.setInDepotNo(rs.getString("inDepotNo"));
				BDIndepotDetailAll.setBarcodeNo(rs.getString("barcodeNo"));
				BDIndepotDetailAll.setGoodsName(rs.getString("goodsName"));
				BDIndepotDetailAll.setInQuantity(rs.getString("inQuantity"));
				BDIndepotDetailList.add(BDIndepotDetailAll);
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}finally
		{
			connDB.commitConn();
		/*	connDB.closeConn();*/
		}
		return BDIndepotDetailList;		
	}	

}
