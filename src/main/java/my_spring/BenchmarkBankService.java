//package my_spring;
//
///**
// * @author Evgeny Borisov
// */
//public class BenchmarkBankService implements DBankService {
//
//    @InjectByType
//    private DBankServiceImpl bankService;
//
//    @Override
//    public void doWork() {
//        bankService.doWork();
//    }
//
//    @Override
//    public void drinkBeer() {
//        long start = System.nanoTime();
//        bankService.drinkBeer();
//        long end = System.nanoTime();
//    }
//}
