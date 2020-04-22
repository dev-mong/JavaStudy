//	if(delete.trim().isEmpty()) { //입력 값이 공백 일 때 
//				System.out.println("Yes(yes) 또는 No(no)를 입력하세요");
//				delete=sc.nextLine();
//				
//				if(delete.equals("Yes")||delete.equals("yes")) {
//					for(int i=index;i<length;i++) {
//						phoneData[i] = phoneData[i+1]; // 삭제된 배열에 인덱스 i+1의 값 저장 
//					}
//					length --; //배열이 삭제되어 배열의 길이가 줄어듬 
//					
//					System.out.println("\""+nameInput+"\"님의 정보가 삭제되었습니다.");
//					return;
//				} else if(delete.equals("No")||delete.equals("no")) {
//					System.out.println("\""+nameInput+"\"님의 정보가 삭제되지 않았습니다.");
//					return;
//				} 
//				
//				
//			} 