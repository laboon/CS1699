;; 1...100
;; /3, fizz
;; /5, buzz
;; /15, fizzbuzz
;; or number


(defun fizzbuzz ()
  "prints fizzbuzz"
    (interactive)
      (with-current-buffer (get-buffer-create "*fizzbuzz-output*")
          (erase-buffer)
              (let ((i 1))
                    (while (< i 101)
                            (insert (fizzbuzz-output i) "\n")
                                    (incf i)))))



(defun fizzbuzz-output (num)
  (cond ((= 0 (mod num 15)) "fizzbuzz")
          ((= 0 (mod num 3)) "fizz")
                  ((= 0 (mod num 5)) "buzz")
                          (t (number-to-string num))))

