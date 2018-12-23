package GIS;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Geom.Geom_element;
import Geom.Point3D;
//The department represents a collection of fruits(There's a GPS in them) for one pakmen.
//* @author yitzhak.
public class Pathh {
	public ArrayList<furit> list;
	public Pathh() {  
		ArrayList<furit> list= new ArrayList<furit>();
	}
	public double distance(){//This is a function for calculating distance
		furit p = null; double sum=0;
		Iterator <furit> pp=list.iterator();
		if(pp.hasNext()){
			p=pp.next();
		}
		while(pp.hasNext()){
			furit pp2=pp.next();
			sum=sum+(p.getPoint()).distance3D(pp2.getPoint());
		}
		return sum;
	}
	/////*****geters and seters//////
	public ArrayList<furit> getList() {
		return list;
	}
	public void setList(ArrayList<furit> list) {
		this.list = list;
	}	
}



