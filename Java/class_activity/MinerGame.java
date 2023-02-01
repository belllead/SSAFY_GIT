package com.ssafy.ws.step5;

import java.util.Scanner;

public class MinerGame {
	public static void main(String[] args) {
		//광산 크기 입력받음
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		//광산 정보 입력받음
		int arr[][]=new int[N][N];
		int mmr=0,mmc=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==0) {mmr=i;mmc=j;} //광부위치
			}
		}
		//광부 이동 횟수
		int M=sc.nextInt();
		String miner[]=new String[M];
		for(int i=0;i<M;i++) {
			miner[i]=sc.next();
		}
		//U 상, D 하, L 좌, R 우, X 다이너마이트
		int[] Xr= {-1,1,0,0,-1,-1,1,1};
		int[] Xc= {0,0,-1,1,-1,1,-1,1};
		
		int mover[]= {-1,1,0,0};
		int movec[]= {0,0,-1,1};
		
		//광부 이동
		int cnt=0;
		for(int i=0;i<M;i++) {
			
			
			if(miner[i].equals("D")) {
				mmr+=mover[1];
				mmc+=movec[1];
				if(arr[mmr][mmc]>1) {
					
					arr[mmr][mmc]--;
					mmr-=mover[1];
					mmc-=movec[1];
				}
				else if(arr[mmr][mmc]==1){cnt++; arr[mmr][mmc]=0;}
				
			}
			
			
			
			else if(miner[i].equals("U")) {
				mmr+=mover[0];
				mmc+=movec[0];
				if(arr[mmr][mmc]>1) {
					
					arr[mmr][mmc]--;
					mmr-=mover[0];
					mmc-=movec[0];
				}
				else if(arr[mmr][mmc]==1){cnt++; arr[mmr][mmc]=0;}
			}
			
			
			
			else if(miner[i].equals("L")) {
				mmr+=mover[2];
				mmc+=movec[2];
				if(arr[mmr][mmc]>1) {
					
					arr[mmr][mmc]--;
					mmr-=mover[2];
					mmc-=movec[2];
				}
				else if(arr[mmr][mmc]==1){cnt++; arr[mmr][mmc]=0;}
			}

			
			else if(miner[i].equals("R")) {
				mmr+=mover[3];
				mmc+=movec[3];
				if(arr[mmr][mmc]>1) {
					
					arr[mmr][mmc]--;
					mmr-=mover[3];
					mmc-=movec[3];
				}
				else if(arr[mmr][mmc]==1){cnt++; arr[mmr][mmc]=0;}
			}
			
			
			
			else if(miner[i].equals("X")) {
				for(int j=0;j<8;j++) {
					int row=mmr+Xr[j];
					int col=mmc+Xc[j];
					if(arr[row][col]!=0) {cnt++; arr[row][col]=0;}
				}
			}
			
			
			
			
//			System.out.println(miner[i]);
//			System.out.println("광부 위치 : ("+mmr+","+mmc+")");
//			System.out.println("부순 암석 개수 : "+cnt);
				
			}
		System.out.println("광부 위치 : ("+mmr+","+mmc+")");
		System.out.println("부순 암석 개수 : "+cnt);
		
		
		
		
		}
}
