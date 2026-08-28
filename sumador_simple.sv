module sumador_simple (
    input  logic a,
    input  logic b,
    output logic sum,
    output logic cout
);
  logic x;

  assign sum = a ^ b;
  assign cout = a & b;
endmodule
