package Main_Menu;


import Movie.MovieMenu;
import Ticket.TicketManager;
import TimeTable.ScreenMenu;
import user.InfoManager;
import user.NoMemberInfo;
import user.exception.EmptyStringException;
import user.exception.OutOfNumberException;

public class Menu {

	InfoManager info = InfoManager.getInst();
	TicketManager tm = new TicketManager();
	ScreenMenu sm = new ScreenMenu();
	MovieMenu mm=new MovieMenu();
	

	void userMenu() {
		outerLoop:
			while (true) {
				System.out.println("=============|| BITBOX ||============");
				System.out.println("1.관리자 로그인");
				System.out.println("2.고객 로그인");
				System.out.println("3.비회원 입장");
				System.out.println("=====================================");
				int log;
				try {
					log=readNum();
				} catch(OutOfNumberException e) {
					System.out.println(e.getMessage());
					continue;
				} catch(Exception e) {
					System.out.println("잘못된 메뉴를 선택하셨습니다. \n다시 입력해주세요.");
					continue;
				} finally {
					info.sc.nextLine();
				}
				switch(log) {

				case 1:
					adminLogin();
					continue outerLoop;
				case 2:
					while(true) {
						System.out.println("=======새로운 공간에서 펼쳐지는 당신만의 이야기");
						System.out.println("BITBOX에 오신 것을 환영합니다=============");
						System.out.println("1. 회원가입하기");
						System.out.println("2. 로그인");
						System.out.println("==================================");
						int choice=0;
						try {
							choice=readNum();
						} catch(OutOfNumberException e) {
							System.out.println(e.getMessage());
							continue;
						} catch(Exception e) {
							System.out.println("메뉴를 잘못 입력하셨습니다.\n다시 입력해주세요.");
							continue;
						} finally {
							info.sc.nextLine();
						}
						if(choice==1) {
							info.creatId();
							continue;
						} else {
							while(true) {
								String id;
								String pw;

								try {
									System.out.print("아이디를 입력하세요 : ");
									id=info.sc.nextLine();
									System.out.print("패스워드를 입력하세요 :");
									pw=info.sc.nextLine();
								} catch (NullPointerException e) {
									System.out.println("존재하지 않는 회원정보입니다. \n다시 입력해주세요.");
									continue;
								} catch (Exception e) {
									System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.\n다시 입력해주세요.");
									continue;
								}
								if(!(info.login(id, pw))) {
									System.out.println("-------------------------");
									System.out.println("아이디와 패스워드가 일치하지 않습니다.\n다시 입력해주세요.");
									System.out.println("-------------------------");
									continue;
								} else {
									System.out.println("-------------------------");
									System.out.println(id+"님, 환영합니다!");
								}
								while (true) {
									System.out.println("--------------------------");
									System.out.println("1.예매하기");
									System.out.println("2.예매내역확인");
									System.out.println("3.회원정보확인"); //회원정보와 보유금액, 포인트 확인
									System.out.println("4.회원정보수정"); //회원정보 수정, 탈퇴.
									System.out.println("0.로그아웃");
									System.out.println("--------------------------");

									int num;
									try {
										num = readChoice();
									} catch (OutOfNumberException e1) {
										System.out.println(e1.getMessage());
										continue;
									} catch (Exception e) {
										System.out.println("메뉴를 잘못 입력하셨습니다.\n다시 입력해주세요.");
										continue;
									}finally {
										info.sc.nextLine();
									}
									switch(num) {
									case 1:
										tm.creatTicket(info.getMember().get(id));
										break;
									case 2:
										info.showMyTicket(id);
										System.out.println("=======================");
										System.out.println("1.예매 취소");
										System.out.println("2.메인으로");
										int de;
										try {
											de = readNum();
										} catch (OutOfNumberException e) {
											System.out.println(e.getMessage());
											continue;
										} catch (Exception e) {
											System.out.println("메뉴를 잘못 입력하셨습니다.\n다시 입력해주세요.");
											continue;
										} finally {
											info.sc.nextLine();
										}
										if(de==1) {
											tm.delTicket(info.getMember().get(id));
										} else {
											continue;
										}
									case 3:
										info.searchInfo(id);
										break;
									case 4:	
										System.out.println("1.회원정보수정");
										System.out.println("2.회원 탈퇴");
										int sel;
										try {
											sel = readNum();
										} catch (OutOfNumberException e) {
											System.out.println(e.getMessage());
											continue;
										} catch (Exception e) {
											System.out.println("메뉴를 잘못 입력하셨습니다.\\n다시 입력해주세요.");
											continue;
										} finally {
											info.sc.nextLine();
										}
										if (sel==1) {
											info.editInfo(id);
											break;
										} else {
											System.out.println("정말로 탈퇴하시겠습니까? >> ");
											System.out.println("1.예    2.아니오");
											int del;
											try {
												del = readNum();
											} catch (OutOfNumberException e) {
												System.out.println(e.getMessage());
												continue;
											} catch (Exception e) {
												System.out.println("메뉴를 잘못 입력하셨습니다.\\n다시 입력해주세요.");
												continue;
											} finally {
												info.sc.nextLine();
											}
											if (del==1) {
												info.deleteInfo(id);
												System.out.println("그동안 이용해 주셔서 감사합니다!");
												System.exit(0);
												break;
											} else {
												System.out.println("처음으로 돌아갑니다.");
												continue;
											}
										}

									case 0:
										System.out.println(id+"님이 로그아웃 하셨습니다.\n안녕히 가세요!");
										continue outerLoop;

									}

								}
							}
						}
					}
				case 3:
					System.out.println("===비회원으로 입장하셨습니다===");
					System.out.println("1.예매하기");
					System.out.println("2.예매확인");
					System.out.println("3.나가기");
					System.out.println("=======================");
					int no;
					try {
						no=readNum();
					} catch (OutOfNumberException e) {
						System.out.println(e.getMessage());
						continue;
					} catch (Exception e) {
						System.out.println("메뉴를 잘못 입력하셨습니다.\\n다시 입력해주세요.");
						continue;
					} finally {
						info.sc.nextLine();
					}
					switch(no) {
					case 1:
						NoMemberInfo noMember = null;
						String phoneNum=null;
						System.out.println("========비회원 예매를 시작합니다========");
						while(true) {
							System.out.println("전화번호를 입력해주세요. >>");
							try {
								phoneNum=emptyString();
							} catch (EmptyStringException e) {
								System.out.println(e.getMessage());
								continue;
							} catch (Exception e) {
								System.out.println("잘못 입력하셨습니다. \n다시 입력해주세요.");
								continue;
							}

							noMember = new NoMemberInfo(phoneNum);
							info.addNoMemberInfo(phoneNum, noMember);
							break;
						}
						
						tm.creatTicket(info.getNoMember().get(phoneNum));
						
						continue;
					case 2:
						System.out.println("예매할 때 입력하신 전화번호를 입력해주세요");
						System.out.print("전화번호 : ");
						phoneNum=info.sc.nextLine();
						info.showNoMemberTicket(phoneNum);
						continue;
						
					case 3:
						System.out.println("초기화면으로 돌아갑니다.");					
						continue outerLoop;
					}
					
					
				}
			}
	}

	//관리자 로그인
	void adminLogin() {

		while(true) {

			System.out.println("====관리자 로그인 메뉴입니다=====");
			String id;
			String pw;
			try {
				System.out.print("아이디를 입력하세요 : ");
				id=info.sc.nextLine();
				System.out.print("패스워드를 입력하세요 :");
				pw=info.sc.nextLine();
			} catch (NullPointerException e) {
				System.out.println("존재하지 않는 회원정보입니다. \n다시 입력해주세요.");
				continue;
			} catch (Exception e) {
				System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.\n다시 입력해주세요.");
				continue;
			}
			if(info.adminCreat(id, pw)) {
				outerLoop:
					while(true) {
						System.out.println("==========================");
						System.out.println("==관리자로 로그인 하셨습니다.==");
						System.out.println("==========================");
						System.out.println("1.회원관리");
						System.out.println("2.영화관리");
						System.out.println("3.상영관 관리");
						System.out.println("4.시간표 관리");
						System.out.println("5.매출 관리");
						System.out.println("0.관리자 로그아웃");
						System.out.println("---------------------------");
						int ad;
						try {
							ad = readChoice();
						} catch (OutOfNumberException e) {
							System.out.println(e.getMessage());
							continue;
						} catch (Exception e) {
							System.out.println("메뉴를 잘못 입력하셨습니다.\\n다시 입력해주세요.");
							continue;
						}	finally {
							info.sc.nextLine();
						}
						switch(ad) {
						case 1 :
							while(true) {
								System.out.println("회원 관리 메뉴를 선택하세요.");
								System.out.println("1.전체 회원 정보 출력");
								System.out.println("2.비회원 예매 정보 출력");
								System.out.println("2.회원정보 검색");
								System.out.println("3.회원정보 수정");
								System.out.println("4.회원 삭제");
								System.out.println("0.초기 메뉴로 돌아갑니다.");
								int mana;
								try {
									mana = readChoice();
								} catch (OutOfNumberException e) {
									System.out.println(e.getMessage());
									continue;
								} catch (Exception e) {
									System.out.println("메뉴를 잘못 입력하셨습니다.\\n다시 입력해주세요.");
									continue;
								}finally {
									info.sc.nextLine();
								}
								switch(mana) {
								case 1:
									System.out.println("전체 회원 정보를 출력합니다.");
									info.showAllMemberInfo();
									continue;
								case 2:
									System.out.println("비회원 예매 정보를 출력합니다.");
									info.showAllNoMemberInfo();
									continue;
								case 3:
									System.out.println("검색하실 아이디를 입력하세요 >> ");
									String searchId;
									try {
										searchId= info.sc.nextLine();
									} catch (NullPointerException e) {
										System.out.println("존재하지 않는 회원정보입니다. \n다시 입력해주세요.");
										continue;
									} catch (Exception e) {
										System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.\n다시 입력해주세요.");
										continue;
									}
									info.searchInfo(searchId);
									continue;
								case 4:
									System.out.println("수정하실 아이디를 입력하세요 >> ");
									String editId;
									try {
										editId= info.sc.nextLine();
									} catch(NullPointerException e) {
										System.out.println("존재하지 않는 회원정보입니다. \n다시 입력해주세요.");
										continue;
									} catch (Exception e) {
										System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.\n다시 입력해주세요.");
										continue;
									}
									info.editInfo(editId);
									continue;
								case 5 :
									System.out.println("삭제하실 아이디를 입력하세요 >> ");
									String delId;
									try {
										delId= info.sc.nextLine();
									} catch (NullPointerException e) {
										System.out.println("존재하지 않는 회원정보입니다. \n다시 입력해주세요.");
										continue;
									} catch (Exception e) {
										System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.\n다시 입력해주세요.");
										continue;
									}
									info.deleteInfo(delId);
									continue;
								case 0 :
									System.out.println("메뉴로 돌아갑니다.");
									continue outerLoop;
								}
							}
						case 2:
							mm.ShowMenu();
							continue;
						case 3:
							sm.showScreenMenu();
							continue;
						case 4:
							
							continue;
						case 5:

							continue;
						case 0:
							System.out.println("관리자 계정에서 로그아웃 합니다.");							
							return;
						}
					}
			}
		}


	}

	int readNum() throws OutOfNumberException {
		int num=info.sc.nextInt();
		if (!(num>0 && num<=3)) {
			OutOfNumberException ex = new OutOfNumberException();
			throw ex;
		}
		return num;
	}

	int readChoice() throws OutOfNumberException {
		int choice=info.sc.nextInt();
		if (!(choice>=0 && choice <=5)) {
			OutOfNumberException ex = new OutOfNumberException();
			throw ex;			
		}
		return choice;
	}
	
	String emptyString() throws EmptyStringException {
		String str = info.sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				EmptyStringException e = new EmptyStringException();
				throw e;
			}
		}
		return str;
	}



}
