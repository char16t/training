(ns training.core-test
  (:require [clojure.test :refer :all]
            [training.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest apples-1-test
  (is (= (apples-1 3 14) 4)))

(deftest apples-2-test
  (is (= (apples-2 3 14) 2)))

(deftest next-prev-test
  (is (= (next-prev 179)
         "The next number for the number 179 is 180.\nThe previous number for the number 179 is 178.")))

(deftest hypotenuse-test
  (is (= (hypotenuse 3 4) 5.0)))        

(deftest last-digit-test
  (is (= (last-digit 179) 9)))

(deftest dozens-test
  (is (= (dozens 42) 4)))

(deftest dozens-test
  (is (= (dozens 179) 7)))  

(deftest three-digit-sum-test
  (is (= (three-digit-sum 179) 17))) 

(deftest eclock-1-test
  (is (= (eclock 150) [2 30])))
  
(deftest eclock-2-test
  (is (= (eclock 1441) [0 1])))
  
(deftest price-1-test
  (is (= (price 10 15 2) [20 30])))

(deftest price-2-test
  (is (= (price 2 50 4) [10 0])))
  
(deftest time-diff-1-test
  (is (= (time-diff 1 1 1 2 2 2) 3661))) 

(deftest time-diff-2-test
  (is (= (time-diff 1 2 30 1 3 20) 50)))

(deftest mymax-test
  (is (= (mymax 1 2) 2)))
