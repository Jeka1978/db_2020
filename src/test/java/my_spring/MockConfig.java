//package my_spring;
//
///**
// * @author Evgeny Borisov
// */
//public class MockConfig implements Config {
//    @Override
//    public <T> Class<T> getImpl(Class<T> type) {
//        if (type == SuperHero.class) {
//            return (Class<T>) Batman.class;
//        }
//        throw new UnsupportedOperationException("ты дибил, не видишь что мой мок только для бэтманов");
//    }
//}
