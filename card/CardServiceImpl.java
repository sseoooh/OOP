package card;

public class CardServiceImpl implements CardService{

	@Override
	public CardBean info(String kind, int number) {
		CardBean cardBean = new CardBean();
		cardBean.setKind(kind);
		cardBean.setNumber(number);
		// TODO Auto-generated method stub
		return cardBean;
	}

}
