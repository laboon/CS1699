class String
  def is_i?
    !!(self =~ /^[-+]?[0-9]+$/)
  end
end

def fizzbuzz(max_val)
  (1..max_val).each do |n|
    if ((n % 3) == 0) then
      puts "fizz"
    elsif ((n % 5) == 0) then
      puts "buzz"
    elsif ((n % 5 == 0) && (n % 3 == 0)) then
      puts "fizzbuzz"
    else
      puts n.to_s
    end
  end
end

# EXECUTION STARTS HERE

print "Enter n: "
n = gets.chomp
if n.is_i? && n.to_i < 101 then
  fizzbuzz(n.to_i)
elsif n.is_i? then
  raise "ERROR: NUMBER TOO LARGE!!!!"
else
  raise "ERROR: NOT A POSITIVE INTEGER!!!!"
end
