# 해리포터 시리즈가 시중에 1~5권 까지 나와 있다고 한다. (현재는 더 많은 시리즈가 있긴 하지만..)
# 
# 책 한권의 가격은 8 EUR 이다.
# 
# 하지만 다음과 같은 조건으로 책 값을 할인 받을 수 있다고 한다.
# 
# 서로 다른 두 권을 구입하면 5% 할인
# 서로 다른 세 권을 구입하면 10% 할인
# 서로 다른 네 권을 구입하면 20% 할인
# 서로 다른 다섯 권(전부!)을 구입하면 25% 할인
# 여러분은 이제 저마다 쇼핑카트에 가득 해리포터 책들을 담고 있는 손님들을 위해 가장 적은 금액으로 책들을 구입할 수 있도록 도와주는 알고리즘을 작성해야 한다.
# 
# 예를 들어 다음과 같이 책을 구입한다면
# 
# 2 copies of the first book
# 2 copies of the second book
# 2 copies of the third book
# 1 copy of the fourth book
# 1 copy of the fifth book
# 여러분이 작성한 알고리즘을 이용하면 51.20 EUR 이라는 최저가가 나와야 한다.


books = {str(i):0 for i in range(1,6)}

def buy(books, idx, count):
	totalPrice = 0
	books[str(idx)]+=count
							
	t0 = dict(books);	
	while sum(t0.values()):
		buyCnt=sortCnt=0;
		for k in t0:
			if t0[k]>0: sortCnt+=1; buyCnt+=1; t0[k]-=1
								
		print((100-[0,5,10,20,25][sortCnt-1])/100.0)
		totalPrice+=((8*buyCnt)*((100-[0,5,10,20,25][sortCnt-1])/100.0))

	print(totalPrice, books)
	

buy(books, 1, 2)
buy(books, 2, 2)
buy(books, 3, 2)
buy(books, 4, 1)
buy(books, 5, 1)


