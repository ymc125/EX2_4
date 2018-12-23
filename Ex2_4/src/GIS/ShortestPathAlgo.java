package GIS;
import java.util.ArrayList;
import java.util.Iterator;

import Geom.Point3D;
public class ShortestPathAlgo {
	public game game;
	public ArrayList<furit> fur_temp=new ArrayList<>();
	public ArrayList<pakmen> pak_temp=new ArrayList<>();
	public ArrayList<pointalgo> pointalgo=new ArrayList<>();

	public ShortestPathAlgo(ArrayList<furit> fur_temp,ArrayList<pakmen> pak_temp,) {//יצירת עותק של פירות
	this.	fur_temp=fur_temp;
	this.pak_temp=pak_temp;
		}
	}
	public int algo() {
		
		{
		if(this.isEmpty()) {
			return -1;
		}
		ArrayList<pointalgo> closs=new ArrayList<pointalgo>();
		closs(pak_temp,fur_temp);
		Iterator<pointalgo> clo = closs.iterator();
		pointalgo p=new pointalgo();
		pakmen pa=null;double time=0,timetop=p.getTime();
		furit fur= p.getFurit();
		pakmen pak_new=null;//pakmen pakmen=null, 
		Iterator<pakmen> pak = game.pakmen.iterator();
		while(pak.hasNext()) {
			pa=pak.next(); 
			time=(distance3d(fur.getPoint(), pa.getPoint())- pa.getRadius()) / pa.getSpeed();
			if (time< timetop )
				timetop=time;
			pak_new=pa;
		}
					pak_new.getPath_pak().getList().add(fur);
				
	}
					return algo();
	}

	public void closs(ArrayList<pakmen> pak_temp, ArrayList<furit> fur_temp ) {
		double dis=0, distop=Integer.MAX_VALUE;
		furit fur=null, bestfurit=null; pakmen pak=null;
		Iterator<pakmen> pakmen = game.pakmen.iterator();
		while(pakmen.hasNext()) {
			pak=(pakmen) pakmen.next();
			Iterator<furit> furit = game.furit.iterator();
			while(furit.hasNext()) {
				fur=(furit) furit.next();
				dis=distance3d(pak.getPoint(), fur.getPoint());
				if (dis<distop)
					distop=dis;
				bestfurit=fur;
			}
		}
		double time=(distop-pak.getRadius())/pak.getSpeed();
		//מחיקה לפוינטאלגו הקודם ומחיקה לפרי
		pointalgo.add(new pointalgo(bestfurit, pak, time));
		fur_temp.remove(fur);
	}

	//}





	private double distance3d(Point3D point3d, Point3D point3d2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}




	private void addAll(String fruits) {///***algo//
		// TODO Auto-generated method stub

	}


}
